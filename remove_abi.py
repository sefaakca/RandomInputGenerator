#!/usr/bin/env python
# -*- coding: utf-8 -*-
import sys
def modify_text(file_name, result_string):
    with open(file_name, "r+") as f:
        f.truncate()   #清空文件
        f.write(result_string)

file_name = sys.argv[1]
file_object = open(file_name)
file_context = file_object.read()

raw_result = file_context.split("=======")
 
longest = raw_result[raw_result.index(sorted(raw_result,key=lambda k:len(k),reverse=True)[0])]
x = longest.strip()
x = x.lstrip()
final = x.replace('Contract JSON ABI ', '')
fianl = x.replace(' ', '')
result = ''
for i in final:
    if i.isdigit() or i.isalpha() :
        result = result + i 
modify_text(file_name,result) 
