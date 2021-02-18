def call(){
	pipeline {
		agent any
		stages {
			stage('print') {
				steps {
					println 'test shared library'
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
