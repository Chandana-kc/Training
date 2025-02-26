#echo "No of Arguments $#"
#echo "First Arguments $1"
#echo "Second Arguments $2"
#echo "Third Arguments $3"

#Conditional Scripting

echo "Enter Your age"
read age
echo "Are you Indian"
read citizen
if [ $age -ge 18 ] && [ $citizen = "yes" ] || [ $citizen = "YES" ];then 
    echo "You are eligible for Vote"
else
    echo "You are not eligible for Vote"
fi

