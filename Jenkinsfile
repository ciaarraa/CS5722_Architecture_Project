pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git "https://github.com/ciaarraa/CS5722_Software_Architecture.git"
                sh "mvn clean compile"
            }
        }
    }
}