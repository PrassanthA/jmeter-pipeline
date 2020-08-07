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
            sh 'mvn Clean verify'
        }
       
    stage('Performance Test') {
        steps {
            sh 'mvn verify -Pperformance'
        }
    }
  }
}
