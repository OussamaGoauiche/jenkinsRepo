pipeline {
	agent any

	environment {
		mavenHome = tool 'maven-3.6.3'
	}

	tools {
		jdk 'java 17'
	}

	stages {

		stage('Build'){
			steps {
				sh "mvn clean install -DskipTests"
			}
		}

		stage('Test'){
			steps{
				sh "mvn test"
			}
		}

		stage('Deploy') {
			steps {
			    sh "mvn -s /root/.m2/settings.xml jar:jar deploy:deploy"
			}
		}
	}
}