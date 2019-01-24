pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
         stage('Deliver') { 
            steps {
                sh 'mvn jar:jar install:install help:evaluate -Dexpression=project.name' 
                sh 'mvn help:evaluate -Dexpression=project.name'
                sh 'mvn help:evaluate -Dexpression=project.version'
                sh 'java -jar target/springcloud_1_eurekaserver-0.0.1-SNAPSHOT.jar com.example.springcloud_1_eurekaserver.Springcloud1EurekaserverApplication '
            }
        }
    }
}
