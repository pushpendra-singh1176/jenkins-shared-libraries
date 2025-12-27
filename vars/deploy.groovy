def call() {
    sh '''
    docker rm -f ps-app || true
    docker run -d --name ps-app -p 8000:8000 notes-app:latest
    '''
}

