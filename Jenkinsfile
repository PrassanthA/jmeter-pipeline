pipeline {
  agent any
 tools{
maven 'maven 3.5.2'
   jdk 'java'
  }
  stages {
    stage('Build') {
        steps {
            bat 'mvn verify -Pperformance'
        }
    }
  }
}
