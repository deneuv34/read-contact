/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, { Component } from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  View,
  ListView,
} from 'react-native';

import { ContactProvider } from './ContactModule';

const ds = new ListView.DataSource({ rowHasChanged: (r1, r2) => r1!== r2})
export default class ContactNativeModules extends Component {
  costructor() {
    super();
    this.state = {
      data: ds.cloneWithRows([{name: 'Asbun', telp: '9128391'}, {name: 'Ascap', telp: '12381'}]),
    }
  }

  

  render() {
    return (
      <View style={styles.container}>
        <ListView
          dataSource={this.state.data}
          renderRow={(rowData) => {
            <Text>{rowData.name}</Text>
          }}
        />
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
  welcome: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
  instructions: {
    textAlign: 'center',
    color: '#333333',
    marginBottom: 5,
  },
});

AppRegistry.registerComponent('ContactNativeModules', () => ContactNativeModules);
