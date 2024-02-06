pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                echo 'Stage: Checkout'
                // Aquí iría tu código para el checkout
            }
        }
        stage('Build') {
            steps {
                echo 'Stage: Build'
                // Aquí iría tu código para el build
            }
        }
        stage('Deploy') {
            steps {
                echo 'Stage: Deploy'
                echo "ConfigServer: ${configServer}"
                // Aquí iría tu código para el deploy
            }
        }
    }
}
