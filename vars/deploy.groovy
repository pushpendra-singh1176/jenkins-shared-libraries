def call() {
    sh '''
    docker rm -f ps-app || true
    docker run -d \
  --name ps-app \
  -p 8000:8000 \
  --link mysql-db \
  -e DB_NAME=notesdb \
  -e DB_USER=notesuser \
  -e DB_PASSWORD=notespwd \
  -e DB_HOST=mysql-db \
  xerox2/notes-app:latest
 '''
}

