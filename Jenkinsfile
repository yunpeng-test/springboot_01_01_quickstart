pipeline {
  agent any
  stages {
    stage('git pull') {
      steps {
        sh 'git clone https://ghproxy.com/github.com/yunpeng-test/git-test.git'
      }
    }

    stage('mavn') {
      steps {
        sh 'mvn -Dmaven.test.skip=true clean package'
      }
    }

  }
}