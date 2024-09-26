import os

print("Student add v1")

name = input("Name of Student >>> ")
id = input("id of Student >>> ")
gender = input("Gender of Student >>> ")
age = input("Age of Student >>> ")
grade = input("Assessed grade of Student >>> ")

file_path = "./src/StudentDB/StudentManage.java"

data_java = f"studentList.add(new StudentInfo({id}, \"{name.capitalize()}\", \"{gender.capitalize()}\", {age}, {grade}));"

with open(file_path, "r") as f:
    content_java = f.readlines()

content_java.insert(-9, "            " + data_java + "\n")

open(file_path, "w").write("".join(content_java))
