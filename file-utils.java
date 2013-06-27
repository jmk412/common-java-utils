{\rtf1\ansi\ansicpg1252\cocoartf1138\cocoasubrtf510
{\fonttbl\f0\fmodern\fcharset0 Courier-Bold;\f1\fmodern\fcharset0 Courier;}
{\colortbl;\red255\green255\blue255;\red93\green21\blue66;\red55\green83\blue173;\red116\green143\blue175;
\red116\green20\blue14;\red23\green48\blue246;\red66\green105\blue78;}
\margl1440\margr1440\vieww22260\viewh13040\viewkind0
\deftab720
\pard\pardeftab720

\f0\b\fs26 \cf2 public\'a0class\'a0
\f1\b0 \cf0 Util\{\
\pard\pardeftab720
\cf1 \'a0\'a0\'a0\'a0\cf3 /**\cf0 \
\cf1 \'a0\'a0\'a0\'a0\'a0\cf3 *\'a0Routine\'a0readLinesFile.\cf0 \
\cf1 \'a0\'a0\'a0\'a0\'a0\cf3 *\'a0\cf0 \
\cf1 \'a0\'a0\'a0\'a0\'a0\cf3 *\'a0\cf4 @param\'a0\cf3 inFile\'a0File\cf0 \
\cf1 \'a0\'a0\'a0\'a0\'a0\cf3 *\'a0\cf4 @param\'a0\cf3 prefixMode\'a0int\cf0 \
\cf1 \'a0\'a0\'a0\'a0\'a0\cf3 *\'a0\cf4 @param\'a0\cf3 prefix\'a0String\cf0 \
\cf1 \'a0\'a0\'a0\'a0\'a0\cf3 *\'a0\cf4 @param\'a0\cf3 maxLinesRead\'a0int\cf0 \
\cf1 \'a0\'a0\'a0\'a0\'a0\cf3 *\'a0\cf4 @return\'a0\cf3 String\cf0 \
\cf1 \'a0\'a0\'a0\'a0\'a0\cf3 *\'a0\cf4 @throws\'a0\cf3 IOException\cf0 \
\cf1 \'a0\'a0\'a0\'a0\'a0\cf3 */\cf0 \
\cf1 \'a0\'a0\'a0\'a0
\f0\b \cf2 public\'a0
\f1\b0 \cf0 String\'a0readLinesOfFile(
\f0\b \cf2 final\'a0
\f1\b0 \cf0 File\'a0inFile,\'a0
\f0\b \cf2 final\'a0int\'a0
\f1\b0 \cf0 prefixMode,\'a0
\f0\b \cf2 final\'a0
\f1\b0 \cf0 String\'a0prefix,\'a0
\f0\b \cf2 int\'a0
\f1\b0 \cf0 maxLinesRead)\'a0
\f0\b \cf2 throws\'a0
\f1\b0 \cf0 IOException\'a0\'a0\{\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf0 \
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 final\'a0
\f1\b0 \cf0 StringBuffer\'a0resultBuffer\'a0=\'a0
\f0\b \cf2 new\'a0
\f1\b0 \cf0 StringBuffer(\cf5 128\cf0 );\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 final\'a0
\f1\b0 \cf0 FileInputStream\'a0stream\'a0=\'a0
\f0\b \cf2 new\'a0
\f1\b0 \cf0 FileInputStream(inFile);\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 final\'a0
\f1\b0 \cf0 BufferedReader\'a0reader\'a0=\'a0
\f0\b \cf2 new\'a0
\f1\b0 \cf0 BufferedReader(
\f0\b \cf2 new\'a0
\f1\b0 \cf0 InputStreamReader(stream));\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf0 \
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 try\'a0
\f1\b0 \cf0 \{\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf0 String\'a0data\'a0=\'a0\cf6 ""\cf0 ;\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 int\'a0
\f1\b0 \cf0 lineNumber\'a0=\'a0\cf5 1\cf0 ;\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 boolean\'a0
\f1\b0 \cf0 maxReached\'a0=\'a0
\f0\b \cf2 false
\f1\b0 \cf0 ;\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 do\'a0
\f1\b0 \cf0 \{\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf7 //\'a0Perform\'a0simple\'a0max,\'a0-1\'a0means\'a0ignore\'a0the\'a0max\'a0value.\cf0 \
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf0 maxReached\'a0=\'a0(maxLinesRead\'a0==\'a0-\cf5 1\cf0 )\'a0?\'a0
\f0\b \cf2 false\'a0
\f1\b0 \cf0 :\'a0(lineNumber\'a0>=\'a0maxLinesRead);\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf0 data\'a0=\'a0reader.readLine();\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 if\'a0
\f1\b0 \cf0 (data\'a0!=\'a0
\f0\b \cf2 null
\f1\b0 \cf0 )\'a0\{\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 final\'a0
\f1\b0 \cf0 String\'a0curPrefix\'a0=\'a0prefix\'a0==\'a0
\f0\b \cf2 null\'a0
\f1\b0 \cf0 ?\'a0\cf6 ""\'a0\cf0 :\'a0prefix;\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf0 resultBuffer.append(curPrefix).append(lineNumber).append(\cf5 ':'\cf0 );\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf0 resultBuffer.append(inFile.getAbsolutePath()).append(\cf5 ':'\cf0 );\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf0 resultBuffer.append(data).append(\cf5 '\\n'\cf0 );\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf0 \}\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf0 lineNumber++;\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf0 \}\'a0
\f0\b \cf2 while
\f1\b0 \cf0 ((data\'a0!=\'a0
\f0\b \cf2 null
\f1\b0 \cf0 )\'a0&&\'a0!maxReached);\
\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf7 //\'a0Add\'a0a\'a0line\'a0number\'a0max\'a0indicator\cf0 \
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 if\'a0
\f1\b0 \cf0 (maxReached)\'a0\{\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf0 resultBuffer.append(\cf6 "...\\n"\cf0 );\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf0 resultBuffer.append(\cf6 "Max\'a0of\'a0"\cf0 ).append(lineNumber-\cf5 1\cf0 ).append(\cf6 "\'a0lines\'a0reached\'a0for\'a0"\cf0 );\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf0 resultBuffer.append(inFile.getAbsolutePath());\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf0 resultBuffer.append(data).append(\cf5 '\\n'\cf0 );\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf0 \}\'a0\cf7 //\'a0End\'a0of\'a0the\'a0if\'a0//\cf0 \
\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf0 \}\'a0
\f0\b \cf2 finally\'a0
\f1\b0 \cf0 \{\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 if\'a0
\f1\b0 \cf0 (reader\'a0!=\'a0
\f0\b \cf2 null
\f1\b0 \cf0 )\'a0\{\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 try\'a0
\f1\b0 \cf0 \{\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf0 reader.close();\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf0 \}\'a0
\f0\b \cf2 catch\'a0
\f1\b0 \cf0 (IOException\'a0e)\'a0\{\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf0 ;\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf0 \}\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf0 \}\
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf0 \}\'a0\cf7 //\'a0End\'a0of\'a0Finally\'a0//\cf0 \
\cf1 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 return\'a0
\f1\b0 \cf0 resultBuffer.toString();\
\cf1 \'a0\'a0\'a0\'a0\cf0 \}\
\
\}}