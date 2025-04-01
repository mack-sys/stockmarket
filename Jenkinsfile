pipeline {
    agent any  // Runs on any available agent

    stages {
        stage('Checkout') {
            steps {
               echo 'Checkout application...'
            }
        }

        stage('Build') {
            steps {
           	  echo 'Building application...'
            }
        }

        stage('Test') {
            steps {
                echo 'Testing application...'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying application...'
            }
        }
    }
}
