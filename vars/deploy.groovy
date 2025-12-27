def call() {
    sh '''
    docker run -d --name ps-app -p 8000:8000 notes-app:latest
    '''
}

