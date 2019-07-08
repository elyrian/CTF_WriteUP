file_in = "dechiffre_1.txt"
file_out = "code_dechiffre_1.py"

with open(file_in,'r') as f_in:
    lines = f_in.readlines()
    with open(file_out,'w') as f_out:
        for l in lines:
            fields = l.strip().split()
            a_index = fields[0].split('[')[1].split(']')[0]
            final_index = fields[2].split('[')[1].split(']')[0]
            xor_value = fields[4].split(')')[0]
            f_out.write("final[%s] = input_str[%s] ^ %s\n" % (final_index, a_index, xor_value))
