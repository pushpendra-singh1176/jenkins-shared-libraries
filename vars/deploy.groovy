def call() {
    sh '''
    docker rm -f ps-app || true
    docker run -d -p 8000:8000 xerox2/notes-app:latest
    
    '''
}

