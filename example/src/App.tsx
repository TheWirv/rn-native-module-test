import * as React from 'react';

import {View, Text, StyleSheet} from 'react-native';
import {OnChangeFocusView} from 'rn-native-module-test';

export default function App() {
  return (
    <View style={styles.container}>
      <OnChangeFocusView
        onBlur={() => console.log('Blurred')}
        onFocus={() => console.log('Focused')}
        style={styles.box}>
        <Text>Touch Me!</Text>
      </OnChangeFocusView>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
    backgroundColor: 'white',
  },
  box: {
    width: 60,
    height: 60,
    marginVertical: 20,
    backgroundColor: 'red',
  },
});
