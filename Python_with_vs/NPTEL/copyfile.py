infile = open("input.txt", "r")
outfile = open("output.txt", "w")
for line in infile.readlines():
    outfile.write(line)
outfile.close()


outfile = open("output.txt", "a")
contents = infile.readlines()
outfile.writelines(contents)
infile.close()
outfile.close()