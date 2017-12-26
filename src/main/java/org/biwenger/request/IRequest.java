package org.biwenger.request;

import org.biwenger.response.AbstractResponse;

public interface IRequest<R extends AbstractResponse> {

    public R await();
}
