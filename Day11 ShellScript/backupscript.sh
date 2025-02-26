#!/bin/bash

SOURCE_DIR="/d/OneDrive - Olam International/Desktop/ShellScript"
BACKUP_DIR="/d/backup"
TIMESTAMP=$(date +"%Y-%m-%d_%H-%M-%S")
BACKUP_FILE="backup_$TIMESTAMP.tar.gz"

#create Directory 
mkdir -p "$BACKUP_DIR"

#convert tar files
tar -czf "$BACKUP_DIR/$BACKUP_FILE" "$SOURCE_DIR"
