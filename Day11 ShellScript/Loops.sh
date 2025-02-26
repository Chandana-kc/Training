#for i in {1..5}
#do
#    echo "Number: $i"
#done
#!/bin/bash
count=1
while [ $count -le 5 ]
do  
    echo "Iteration: $count"
    count=$((count + 1))
done
SOURCE_DIR="/d/D:\OneDrive - Olam International\Desktop\ShellScript"
BACKUP_DIR="/d/backup"
TIMESTAMP= $(date +"%Y-%m-%d_%H-%M-%S")
BACKUP_FILE="backup_$TIMESTAMP.tar.gz"

#create Directory 
mkdir -p "$BACKUP_DIR"

#convert tar files
tar -czf "$BACKUP_DIR/$BACKUP_FILE" "$SOURCE_DIR"
