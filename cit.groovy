node("master") {
    wrks = env.WORKSPACE
    stage("Prepare"){
        println("Preparing...")
        git(
                url: "https://github.com/Surendarmurugesan/Pipeline-script.git",
                branch: "master"
	    )
        dir('config') {
          git(
                url: "git@github.com:srikrishnaprakash/conf.git",
                branch: "master"
	        )  
        }
        
        
    }
    stage("Clone Application"){
        load 'app/clne.groovy'
    }
    stage("Build"){
        load 'app/bld.groovy'
    }
    stage("Test"){
        println("Testing...")
    }
    stage("Deploy"){
        println("Deploying...")
	   sh "script.sh"
    }
}
