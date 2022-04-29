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

    stage('run') {
      steps {
        sh 'nohup java -jar springboot_01_01_quickstart-0.0.1-SNAPSHOT.jar --server.port=80 > springboot.log &'
      }
    }

    stage('stop') {
      steps {
        sh 'echo \'happy\''
      }
    }

  }
}