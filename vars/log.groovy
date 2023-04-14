//wymagany plugin ansicollor
def loadColor(){
    RED='\033[0;31m'
    CYAN='\033[0;36m'
    BLUE='\033[0;34m'
    ON_YELLOW = '\033[43m'
    NC ='\033[0m'
}
def info(message) {
    loadColor()
    sh """set +x; echo "${BLUE}INFO: $message ${NC}" """
}

def warning(message) {
    loadColor()
    sh """set +x; echo "${ON_YELLOW}WARNING: $message ${NC}" """
}

def error(message) {
    loadColor()
    sh"""set +x; echo "${RED}ERROR: $message ${NC}" """
}
