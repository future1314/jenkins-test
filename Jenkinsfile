pipeline {
    agent { docker 'maven:3.3.3' }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
	    steps {
		sh 'echo "Hello, Jenkins."'
		sh '''
		    echo "Hello, again, Jenkins."
		    ls -lah
		'''
	    }
        }
    }
}
