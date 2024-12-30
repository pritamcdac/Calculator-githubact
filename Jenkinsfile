pipeline {
    agent any
    environment {
        // Optionally define environment variables, e.g., Java home, etc.
        JAVA_HOME = '/usr/lib/jvm/java-11-openjdk'
    }
    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the repository
                checkout scm
            }
        }
        stage('Build') {
            steps {
                // Run Maven build (ensure Maven is installed on the Jenkins machine)
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                // Run tests (unit tests, integration tests)
                sh 'mvn test'
            }
        }
        stage('SonarQube Analysis') {
            steps {
                // Run SonarQube analysis (if SonarQube is integrated)
                withSonarQubeEnv('SonarQube') {
                    sh 'mvn sonar:sonar'
                }
            }
        }
    }
    post {
        success {
            // Handle successful build (e.g., notify via email or Slack)
            echo 'Build and tests passed!'
        }
        failure {
            // Handle failure (e.g., notify via email or Slack)
            echo 'Build failed!'
        }
    }
}
