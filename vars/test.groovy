def call(){
	pipeline {
		agent any
		stages {
			stage('print') {
				steps {
					println 'test webhook'
				}
			}
			stage('java version') {
				steps {
					bat 'java -version'
				}
			}
		}
	}
}