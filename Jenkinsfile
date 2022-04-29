pipeline {
  agent any
  stages {
    stage('pull_code') {
      steps {
        git(url: 'https://ghproxy.com/github.com/yunpeng-test/springboot_01_01_quickstart', branch: 'main')
      }
    }

    stage('deploy') {
      steps {
        sh '''#!/bin/bash
java -jar springboot_01_01_quickstart-0.0.1-SNAPSHOT.jar --server.port=80 > springboot.log &'''
      }
    }

  }
}