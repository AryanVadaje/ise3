pipeline {
    agent any

    stages {
        stage('Build app') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/AryanVadaje/ise3.git']])
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    sh 'docker build -t jenkinsjavaimage.'
                }
            }
        }
        stage('Change image tag'){
            steps{
                script{
                    bat 'docker tag jenkinsjavaimage aryanvadaje/javaapp:v1.0'
                }
            }
        }
        stage('Push image to docker hub'){
            steps{
                script{
                   
                    bat 'docker login -u aryanvadaje -p Aryan@1234'
                   
                    bat 'docker push aryanvadaje/javaapp:v1.0'
                }
            }
        }
    }
}
