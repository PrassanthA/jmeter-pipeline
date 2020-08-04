pipeline {
  agent any
 tools{
maven 'maven 3.5.2'
   jdk 'java 9'
}
  stages {
    stage('Build') {
        steps {
            bat 'mvn verify -Pperformance'
        }
    }
  }
}
