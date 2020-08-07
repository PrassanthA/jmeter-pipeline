pipeline {
  agent {
docker {
image 'maven:3-alpine'
args '-v/root/.m2:/root/.m2'
}
  }
  stages {
    
     stage('Selinium Test') {
       
        steps {
            sh 'mvn -f MavenSelinum/pom.xml clean install'
          }
       
    stage('Performance Test') {
        steps {
            sh 'mvn verify -Pperformance'
        }
    }
  }
}
