echo "Enter your Choice(start/stop/restart):"
read choice
case $choice in
    start)
    echo "Starting the Service ...."
    ;;
stop)
    echo "Stopping the service..."
    ;;
restart)
    echo "Restarting the Service..."
    ;;
*)
    echo "Invalid choice. Please enter start, stop, or restart."
    ;;
esac