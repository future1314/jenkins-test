pipeline {
    agent { docker 'maven:3.3.3' }

    environment {
        WORLD="Jenkins"
    }

    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
		        sh 'echo "Hello, ${WORLD}."'
		        sh '''
		            echo "Hello, again, Jenkins."
		            ls -lah
		        '''
	        }
        }
        stage('test') {
            steps {
                sh 'echo "Test..."'
            }
        }
        stage('pre-deploy-confirm') {
            steps {
                input 'Please confirm whether to proceed deployment.'
            }
        }
        stage('deploy') {
            steps {
                sh 'echo "Deploy..."'
            }
        }
    }

    post {
        always {
            echo 'This will always run'
        }
        success {
            echo 'This will run only if successful'
        }
        failure {
            echo 'This will run only if failed'
        }
        unstable {
            echo 'This will run only if the run was marked as unstable'
        }
        changed {
            echo 'This will run only if the state of the Pipeline has changed'
            echo 'For example, if the Pipeline was previously failing but is now successful'
        }
    }
}
