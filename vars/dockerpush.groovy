def call(String Project, String ImageTag, String dockerhubUser) {
         echo "Pushing Docker image to Docker Hub"
         withCredentials([usernamePassword(credentialsId: "dockerHubCreds", 
                          usernameVariable: "dockerHubUser", 
                          passwordVariable: "dockerHubPass" )])
        sh "docker login -u "${dockerHubUser}" -p "${dockerHubPass}" "
}
        sh "docker push "${dockerHubUser}"/"{Project}":"{ImageTag}"
