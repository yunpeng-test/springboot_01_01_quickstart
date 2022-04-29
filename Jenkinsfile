pipeline {
  agent any
  stages {
    stage('git pull') {
      steps {
        sh 'git clone https://github.com/yunpeng-test/springboot_01_01_quickstart.git'
      }
    }

    stage('mavn') {
      steps {
        sh 'mvn -Dmaven.test.skip=true clean package'
      }
    }

  }
}