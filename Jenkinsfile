pipeline {
    agent any  // Runs on any available agent

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/mack-sys/stockmarket.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying application...'
            }
        }
    }
}
