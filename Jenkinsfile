pipeline {
    agent any  // Run on any available agent

    stages {
        stage('Clone Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/mack-sys/stockmarket.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }

    post {
        success {
            echo 'Build and Tests Passed!'
        }
        failure {
            echo 'Build Failed. Check logs for details.'
        }
    }
}
