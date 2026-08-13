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

    }
}
