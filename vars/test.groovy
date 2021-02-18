def call(){
	pipeline {
		agent any
		stages {
			stage('print') {
				steps {
					script{
						println 'test shared library'
						def testScript = libraryResource 'test.sh'
						writeFile file: 'test.sh', text: testScript
						sh "./test.sh"
					}
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
