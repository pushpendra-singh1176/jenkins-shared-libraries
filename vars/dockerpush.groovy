def call(String project, String imageTag, String dockerHubCred) {

    echo "Pushing Docker image to Docker Hub"

    withCredentials([
        usernamePassword(
            credentialsId: 'dockerHubCred',
            usernameVariable: 'DOCKER_USER',
            passwordVariable: 'DOCKER_PASS'
        )
    ]) {
        sh """
            echo \$DOCKER_PASS | docker login -u \$DOCKER_USER --password-stdin
            docker push \$DOCKER_USER/${project}:${imageTag}
        """
    }
}
