public class FileUtil{
    /**
     * Routine readLinesFile.
     * 
     * @param inFile File
     * @param prefixMode int
     * @param prefix String
     * @param maxLinesRead int
     * @return String
     * @throws IOException
     */
    public String readLinesOfFile(final File inFile, final int prefixMode, final String prefix, int maxLinesRead) throws IOException  {
        
        final StringBuffer resultBuffer = new StringBuffer(128);
        final FileInputStream stream = new FileInputStream(inFile);
        final BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        
        try {
            String data = "";
            int lineNumber = 1;
            boolean maxReached = false;
            do {
                // Perform simple max, -1 means ignore the max value.
                maxReached = (maxLinesRead == -1) ? false : (lineNumber >= maxLinesRead);
                data = reader.readLine();
                if (data != null) {
                    final String curPrefix = prefix == null ? "" : prefix;
                    resultBuffer.append(curPrefix).append(lineNumber).append(':');
                    resultBuffer.append(inFile.getAbsolutePath()).append(':');
                    resultBuffer.append(data).append('\n');
                }
                lineNumber++;
            } while((data != null) && !maxReached);

            // Add a line number max indicator
            if (maxReached) {
                resultBuffer.append("...\n");
                resultBuffer.append("Max of ").append(lineNumber-1).append(" lines reached for ");
                resultBuffer.append(inFile.getAbsolutePath());
                resultBuffer.append(data).append('\n');
            } // End of the if //

        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    ;
                }
            }
        } // End of Finally //
        return resultBuffer.toString();
    }

}