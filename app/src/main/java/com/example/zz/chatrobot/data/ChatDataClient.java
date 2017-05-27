package com.example.zz.chatrobot.data;

import com.example.zz.chatrobot.tuling.TulingApiResult;

/**
 * Model of a client chat item
 */
public class ChatDataClient extends ChatData {

  public ChatDataClient(String content) {
    super();

    this.content = content;
  }

  @Override
  public boolean isClient() {
    return true;
  }

  @Override
  public TulingApiResult getApiResult() {
    return null;
  }

  @Override
  public CharSequence getFormattedContent() {
    return content;
  }
}
