def call(){
	pipeline {
		agent any
		stages {
			stage('print') {
				steps {
					script{
						println 'test shared library'
						def testScript = libraryResource 'test.bat'
						writeFile file: 'test.bat', text: testScript
						bat 'test.bat'
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
