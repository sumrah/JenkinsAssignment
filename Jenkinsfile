pipeline { 
    agent any
    
    tools { 
        maven 'Maven'  
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -X -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            
        }
      stage('Deploy'){
        steps{
        echo "Deploying project"
        }
      }
    }
}
