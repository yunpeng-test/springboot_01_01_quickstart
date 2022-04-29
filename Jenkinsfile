pipeline {
  agent any
  stages {
    stage('git pull') {
      steps {
        sh 'git clone https://ghproxy.com/github.com/yunpeng-test/springboot_01_01_quickstart'
      }
    }

    stage('mavn') {
      steps {
        sh 'mvn -Dmaven.test.skip=true clean package'
      }
    }

    stage('run') {
      steps {
        sh '''cd /var/lib/jenkins/workspace/ot_01_01_quickstart_pipline_main/target
nohup java -jar springboot_01_01_quickstart-0.0.1-SNAPSHOT.jar --server.port=80 > springboot.log &'''
      }
    }

    stage('stop') {
      steps {
        sh 'bash ./shutdown.sh'
      }
    }

  }
}