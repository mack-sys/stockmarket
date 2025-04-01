pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/mack-sys/stockmarket.git', branch: 'main'
            }
        }
        
        stage('Build') {
            steps {
                sh 'mvn clean package'  // Use npm install for Node.js projects
            }
        }
        
        stage('Test') {
            steps {
                sh 'mvn test'  // Run unit tests
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
                // Add deployment commands here
            }
        }
    }
}
