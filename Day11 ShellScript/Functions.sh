add_numbers() {
    sum=$(( $1 + $2 ))
    echo "Sum of $1 and $2 is: $sum"

}

#Calling the function with two numbers
add_numbers 10 20

check_file() {
    if [ -f "$1" ];then
        echo "File '$1' exists."
    else
        echo "File '$1' does not exist."
    fi
}

check_file Loops.sh

system_info() {
    echo "Operating System: $(uname -o)"
    echo "Kernal Version: $(uname -r)"
    echo "Disk Usage:"
    df -h 
}
system_info