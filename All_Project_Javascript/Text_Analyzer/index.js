function analyzeText(text) {
    // Calculate number of characters using length method
    const charCount = text.length;

    // Calculate number of words converting the array using split()method
    const words = text.split(' ');
    const wordCount = words.length;

    // Calculate number of sentences split(),filter(),and trim() method
    const sentences = text.split(/[.!?]/g).filter(sentence => sentence.trim() !== '');
    const sentenceCount = sentences.length;

    // Calculate average word length using reduce method
    const totalWordLength = words.reduce((sum, word) => sum + word.length, 0);
    const averageWordLength = totalWordLength / wordCount;

    // Calculate most common word
    const wordFrequency = {};
    words.forEach(word => {
        const cleanedWord = word.toLowerCase().replace(/[^a-z]/g, '');
        if (cleanedWord !== '') {
            wordFrequency[cleanedWord] = (wordFrequency[cleanedWord] || 0) + 1;
        }
    });

    let mostCommonWord = '';
    let highestFrequency = 0;
    for (const word in wordFrequency) {
        if (wordFrequency[word] > highestFrequency) {
            mostCommonWord = word;
            highestFrequency = wordFrequency[word];
        }
    }

    return {
        charCount,
        wordCount,
        sentenceCount,
        averageWordLength,
        mostCommonWord,
    };
}

// Example usage
const inputText = "This is a simple example. It demonstrates the text analyzer project.";
const analysisResult = analyzeText(inputText);

console.log("Number of characters:", analysisResult.charCount);
console.log("Number of words:", analysisResult.wordCount);
console.log("Number of sentences:", analysisResult.sentenceCount);
console.log("Average word length:", analysisResult.averageWordLength.toFixed(2));
console.log("Most common word:", analysisResult.mostCommonWord);