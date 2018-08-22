/*
 * Copyright © 2012-2018 Vaughn Vernon. All rights reserved.
 *
 * This Source Code Form is subject to the terms of the
 * Mozilla Public License, v. 2.0. If a copy of the MPL
 * was not distributed with this file, You can obtain
 * one at https://mozilla.org/MPL/2.0/.
 */

package io.vlingo.http.resource;

public class HandlerMissingException extends RuntimeException {

  public HandlerMissingException() {
    super();
  }

  public HandlerMissingException(String s) {
    super(s);
  }

  public HandlerMissingException(String s, Throwable throwable) {
    super(s, throwable);
  }

  public HandlerMissingException(Throwable throwable) {
    super(throwable);
  }

  protected HandlerMissingException(String s, Throwable throwable, boolean b, boolean b1) {
    super(s, throwable, b, b1);
  }
}
