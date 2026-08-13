pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                bat '.\\mvnw.cmd clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                bat '.\\mvnw.cmd test'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t calculator-app:latest .'
            }
        }

        stage('Deploy') {
            steps {
                bat '''
                docker stop calculator-container || exit 0
                docker rm calculator-container || exit 0
                docker run -d -p 8082:8081 --name calculator-container calculator-app:latest
                '''
            }
        }

    }
}