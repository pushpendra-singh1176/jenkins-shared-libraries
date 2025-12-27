def call() {
    sh '''
    docker run -d --name ps-app -p 8000:8000 xerox2/notes-app:latest
    '''
}

